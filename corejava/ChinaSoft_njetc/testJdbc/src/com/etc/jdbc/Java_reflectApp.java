package com.etc.jdbc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Java_reflectApp {
	public Java_reflectApp() {
	}

	// 传递一个JavaBean的实例得到字段列表
	public static String getCols(CommonForm form) {
		StringBuffer sb = new StringBuffer();
		Field[] fs = form.getClass().getDeclaredFields();
		Field f = null;
		for (int i = 0; i < fs.length; i++) {
			f = fs[i];
			String fname = f.getName();
			int modifiers = f.getModifiers();
			if (modifiers == 2) {
				sb.append(fname + ",");
			}
		}
		int pos = sb.lastIndexOf(",");
		sb.replace(pos, pos + 1, "".trim());
		return sb.toString();
	}

	// 传递一个javabean的实例(通过反射机制)得到一个相应的新增sql
	public static String getInsertSQL(CommonForm form) {
		Field fs[] = form.getClass().getDeclaredFields();
		Field f = null;
		StringBuffer sb = new StringBuffer();// 字段列表
		sb.append("insert into " + form.tablename + "(");
		StringBuffer sb2 = new StringBuffer(); // 相应字段值的列表
		sb2.append("values(");
		for (int i = 0; i < fs.length; i++) {
			f = fs[i];
			String fname = f.getName();
			int modifiers = f.getModifiers();
			if (modifiers == 2) {
				sb.append(fname + ",");
				String value = JavaRef_Util.runInvokeGet(form, fname);
				sb2.append("'" + value + "',");
			}
		}
		int pos = sb.lastIndexOf(",");
		sb.replace(pos, pos + 1, ")");
		pos = sb2.lastIndexOf(",");
		sb2.replace(pos, pos + 1, ")");
		sb.append(sb2);
		return sb.toString();
	}

	// 传一个实例(通过反射机制)得到一个相应的根据主键查询的SQL
	public static String getPkSelectSQL(CommonForm form) {// String
															// sql="select
															// "+Java_reflect.getCols(form)+"
															// from employee
															// where
															// empid="+form.getEmpid();
		StringBuffer sb = new StringBuffer();
		sb.append("select " + getCols(form) + " from " + form.tablename
				+ " where ");
		String[] pks = form.getPrimary();
		for (int i = 0; i < pks.length; i++) {
			String pkname = pks[i];
			String pkvalue = JavaRef_Util.runInvokeGet(form, pkname);
			sb.append(pkname + "='" + pkvalue + "' and ");
		}
		int pos = sb.lastIndexOf("and");
		sb.replace(pos, pos + 3, "");
		return sb.toString();
	}

	// 传一个实例(通过反射机制)得到一个相应的基于单表查询的SQL
	public static String getQuerySQL(CommonForm form) {
		StringBuffer sb = new StringBuffer();
		sb.append("select " + getCols(form) + " from " + form.tablename);
		return sb.toString();
	}

	// 传一个实例得到主键
	public static String getOrderPK(CommonForm form) {
		String pks[] = form.getPrimary();
		String pkname = pks[0];
		return pkname;
	}

	// 传一个实例(通过反射机制)得到一个相应的删除sql
	public static String getDeleteSQL(CommonForm form) {// delete from 表名 where
														// 主键='主键值'
		StringBuffer sb = new StringBuffer();
		sb.append("delete from " + form.tablename + " where ");
		String pks[] = form.getPrimary();
		for (int i = 0; i < pks.length; i++) {
			String pkname = pks[i];
			String pkvalue = JavaRef_Util.runInvokeGet(form, pkname);
			sb.append(pkname + "='" + pkvalue + "' and ");
		}
		int pos = sb.lastIndexOf("and");
		sb.replace(pos, pos + 3, "");
		return sb.toString();
	}

	// 传一个实例(通过反射机制)得到一个相应的修改sql
	public static String getUpdateSQL(CommonForm form) {// update 表 set
														// 字段1='值',字段2='值' where
														// 主键='主键值'
		StringBuffer sb = new StringBuffer();
		sb.append("update " + form.tablename + " set ");
		JavaDB_Util open = new JavaDB_Util();
		Field fs[] = form.getClass().getDeclaredFields();
		String[] pks = form.getPrimary();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			String fname = f.getName();
			int modifiers = f.getModifiers();
			if (modifiers == 2)
				if (!isinArray(pks, fname)) {
					String fvalue = JavaRef_Util.runInvokeGet(form, fname);
					sb.append(fname + "='" + fvalue + "',");
				}
		}
		int pos = sb.lastIndexOf(",");
		sb.replace(pos, pos + 1, "");
		sb.append(" where ");
		for (int i = 0; i < pks.length; i++) {
			String pkvalue = JavaRef_Util.runInvokeGet(form, pks[i]);
			sb.append(pks[i] + "='" + pkvalue + "' and ");
		}
		pos = sb.lastIndexOf("and");
		sb.replace(pos, pos + 3, "");
		return sb.toString();
	}

	public static boolean isinArray(String[] pks, String fname) {
		boolean isin = false;
		for (int i = 0; i < pks.length; i++) {
			if (fname == pks[i]) {
				isin = true;
				break;
			}
		}
		return isin;
	}

}

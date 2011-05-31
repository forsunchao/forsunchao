package com.etc.jdbc;
   import java.lang.reflect.Method;
   import java.lang.reflect.Field;
   import java.lang.reflect.Modifier;

import java.lang.reflect.*;


public class JavaRef_Util {
  public JavaRef_Util() {
  }
  public static int  getColsCount(DeptForm one)
  {
    Field[] fs=one.getClass().getDeclaredFields();
    Field f=null;
    int count=0;
    for(int i=0;i<fs.length;i++)
    {
      f=fs[i];
      String fname=f.getName();
      String type=f.getType().toString();
      int modifiers=f.getModifiers();
      if(modifiers==2)
      {
        count++;
        String mname=Java_Format.getMethodname(fname,0);
        System.out.println(fname+"---"+mname);
      }
    }
    return count;
  }
  public static int  getMethodCount(DeptForm one)
  {
     Method[] ms=one.getClass().getDeclaredMethods();
     Method m=null;
     int count=0;
     for(int i=0;i<ms.length;i++)
     {
       m=ms[i];
       String mname=m.getName();
       String type=m.getReturnType().toString();
       int modifiers=m.getModifiers();
       String paratype=m.getParameterTypes().toString();
       if(modifiers==1)
       {
         System.out.println(mname+"---"+type+"---"+paratype);
       }
       count++;
     }
     return count;
  }
  public static Method  getMethod(Object one,String fname,int type)
  {
    String mname=Java_Format.getMethodname(fname,type);
    Method[] ms=one.getClass().getDeclaredMethods();
    Method m=null;
    for(int i=0;i<ms.length;i++)
    {
       m=ms[i];
       String methodname=m.getName();
       if(methodname.equals(mname)){
         return m;
       }
    }
    return null;
  }




  public static void runInvokeSet(DeptForm one,String fname,String value)
  {
       Object[] paras=new Object[1];
       Method m=getMethod(one,fname,0);
       Field[] fs=one.getClass().getDeclaredFields();
       Field f=null;
       for(int i=0;i<fs.length;i++)
       {

          f=fs[i];
          String fieldname=f.getName();
          String type=f.getType().toString();
          if(fieldname.equals(fname))
          {
          try {
             if(type.equals(Integer.TYPE.toString())){
               paras[0]=new Integer(value);
             }else if(type.equals(Double.TYPE.toString())){
               paras[0]=new Double(value);
             }else if(type.equals(Float.TYPE.toString())){
               paras[0]=new Float(value);
             }else if(type.equals(Long.TYPE.toString())){
               paras[0]=new Long(value);
             }else{
               paras[0]=value;
             }
              m.invoke(one, paras);
            }catch(Exception ex) {
              ex.printStackTrace();
              System.out.println("********"+fieldname+"***********");
            }
          }
          System.out.println(fieldname+":"+one.getDeptdesc());
       }

  }
  public static String runInvokeGet(Object form,String fname)
  {

      Field f=null;
      String value="";
      Method m=getMethod(form,fname,1);
      try {
        value=m.invoke(form, null).toString();
        System.out.println("method 's return value:"+value);
      }catch (InvocationTargetException ex) {
         ex.printStackTrace();
      }catch (IllegalArgumentException ex) {
         ex.printStackTrace();
      }catch (IllegalAccessException ex) {
         ex.printStackTrace();
      }
    return value;
  }


  public static void main(String arg[])
  {
	  DeptForm form= new DeptForm();
	  
	  //JavaRef_Util.getColsCount(form);
	  //form.setDeptdesc("sadfasdf");
	 // JavaRef_Util.runInvokeGet(form,"deptdesc");
	  JavaRef_Util.runInvokeSet(form,"deptdesc","wwwwwwwww");

  }

}

/*
 * 递归列出目录结构,很重要，比较难
 */
import java.io.*;
public class FileList {
	public static void main(String[] args){
		File f = new File("d:/My Documents");
		System.out.println(f.getName());
		tree(f,1);
	}
	private static void tree(File f,int level){
		String str = "";
		for(int i=0;i<level;i++){
			str += "  ";
		}
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(str + childs[i].getName());
			if(childs[i].isDirectory()){
				tree(childs[i],level + 1);
			}
		}
	}
}

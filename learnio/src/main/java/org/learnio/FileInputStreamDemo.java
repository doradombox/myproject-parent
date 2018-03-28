package org.learnio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * @author Edgar
 * @creation 2018年3月28日
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        fileOutputStreamOpr(fileInputStreamOpr());
    }
    
    static String fileInputStreamOpr() throws IOException {
        /*FileReader out = new FileReader("/Users/huangwenbo/Policy");
//        System.out.println(out.read());
        BufferedReader br = new BufferedReader(out);
        String s = br.readLine();
        while(s!=null)//如果当前行不为空
        {
            System.out.println(s);//打印当前行
            s= br.readLine();//读取下一行
        } 
        br.close();//关闭BufferReader流
        out.close();     //关闭文件流*/    
        File file = new File("/Users/huangwenbo/eos_platform_7.6_install.log");
        if(!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");  
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        /*int size = fileInputStream.available();
        System.out.println(size);*/
        int len = 0;
        //用fileInputStream.read()返回的长度则会漏掉第一个字符,why?
        byte[] buf = new byte[1024];
        StringBuffer sBuffer = new StringBuffer();
        while((len=fileInputStream.read(buf))!=-1){
            String content = new String(buf,0,len);
            System.out.println(content);
            sBuffer.append(content);
        }
        fileInputStream.close();
        return sBuffer.toString();
    }
    
    /**
     * 写入内容,追加形式
     * @throws IOException
     */
    static void fileOutputStreamOpr(String content) throws IOException {
        File f = new File("/Users/huangwenbo/test1.log");
        //OutputStream out = new FileOutputStream(f,true);//追加内容  
        OutputStream out = new FileOutputStream(f);//覆盖内容
        //String str="\r\nHello World";
        byte[] b=content.getBytes();
        for(int i=0;i<b.length;i++){
            out.write(b[i]);
        }  
        out.close();  
    }
}

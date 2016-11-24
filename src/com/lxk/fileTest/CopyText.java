package com.lxk.fileTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制文件：先从硬盘读到内存，在写到硬盘
 */
class CopyText {
    public static void main(String[] args) throws IOException {
        fileCopyRightWay();
    }

    /**
     * 用缓冲区读写，来提升读写效率。
     */
    private static void fileCopyRightWay() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader("D:MyAssetJob.java");//读
            fw = new FileWriter("e:MyAssetJob.txt");//写
            char[] buf = new char[1024];//缓冲区
            int len;
            while ((len = fr.read(buf)) != -1) {
                fw.write(buf, 0, len);//读几个写几个
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    /**
     * 未用缓冲区进行读写，读一个字符就写一个字符。
     */
    public static void fileCopyWrongWay() throws IOException {
        //创建目的地。
        FileWriter fw = new FileWriter("D:MyAssetJob.java");
        //与已有文件关联。
        FileReader fr = new FileReader("E:/MyAssetJob.java");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}

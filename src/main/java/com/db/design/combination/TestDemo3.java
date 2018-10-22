package com.db.design.combination;

import java.util.ArrayList;
import java.util.List;

public class TestDemo3 {
    public static void main(String[] args) {
//针对抽象构件编程
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;

        folder1 = new Folders("Sunny的资料");
        folder2 = new Folders("图像文件");
        folder3 = new Folders("文本文件");
        folder4 = new Folders("视频文件");

        file1 = new Image("小龙女.jpg");
        file2 = new Image("张无忌.gif");
        file3 = new Text("九阴真经.txt");
        file4 = new Text("葵花宝典.doc");
        file5 = new Video("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //从“Sunny的资料”节点开始进行杀毒操作
        folder1.killVirus();

    }
}

abstract class AbstractFile{
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}

class Image extends AbstractFile{

    private String name;

    public Image(String name){
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件"+name+"进行杀毒");
    }
}

class Text extends AbstractFile{

    private String name;

    public Text(String name){this.name = name;}

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}

class Video extends AbstractFile{

    private String name;

    public Video(String name){
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public void killVirus() {
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}

class Folders extends AbstractFile{

    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();

    private List<AbstractFile> fileList2 = new ArrayList<AbstractFile>();

    private String name;

    public Folders(String name){
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
        fileList2.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
        fileList2.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        System.out.println(fileList2);
        System.out.println(fileList);
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirus();
        }
    }
}





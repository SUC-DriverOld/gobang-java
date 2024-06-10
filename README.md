<div align="center">

# Gobang-Java-Simple

![GitHub](https://img.shields.io/github/license/SUC-DriverOld/gobang-java)
![GitHub](https://img.shields.io/github/languages/top/SUC-DriverOld/gobang-java)
![GitHub](https://img.shields.io/github/repo-size/SUC-DriverOld/gobang-java)
![GitHub](https://img.shields.io/github/release/SUC-DriverOld/gobang-java)

gobang-java-simple 使用 java swing 实现的五子棋，simple 分支仅实现人机对战。\
项目用于：南京邮电大学《数据结构与算法课程设计》

</div>

## 快速开始

从[Release](https://github.com/SUC-DriverOld/gobang-java/releases)下载打包发布的版本。

## 开发

1. 下载 JDK1.8 并添加到环境变量
2. 克隆本仓库

   ```bash
   git clone https://github.com/SUC-DriverOld/gobang-java.git --branch simple
   ```

   或者

   ```bash
   git clone https://github.com/SUC-DriverOld/gobang-java.git
   git checkout simple
   ```

3. 从`src\View\StartGame.java`启动

> [!WARNING]
> 从`.jar`启动时请在同级目录下添加`src/images`文件夹，否则会出现找不到图片的错误。例如：

```bash
gobang
│ gobang.jar
└─src
    └─images
         black.png
         ...
```

## 致谢

- [Swing](https://docs.oracle.com/javase/tutorial/uiswing/index.html)
- [Avidel](https://github.com/avidele)

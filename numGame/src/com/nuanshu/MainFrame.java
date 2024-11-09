package com.nuanshu;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;

public class MainFrame extends JFrame {
    //图片地址
    private static final String imagePath = "numGame/src/JavaStoneGame/";
    //准备一个数组，存储图片位置
    private int[][] imageData = {{3, 4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14}, {15, 16, 17, 1}};
    private int[][] winData = {{3, 4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14}, {15, 16, 17, 1}};
    //记录空白图片位置
    private int row = 3;
    private int col = 3;

    private int count = 0;

    public MainFrame() {
        //初始化窗口
        initFrame();
        //打乱顺序
        initRandomArray();
        //初始化图片
        initImage();
        //初始化系统菜单
        initMenu();
        //窗口绑定按键事件
        initKeyPressEvent();
        //显示窗口
        this.setVisible(true);
    }

    private void initFrame() {
        //设置标题
        this.setTitle("华容道");
        //设置宽高
        this.setSize(465, 575);
        //设置窗口关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口居中
        this.setLocationRelativeTo(null);
        //设置绝对布局
        this.setLayout(null);


    }

    private void initImage() {
        //清除原图片
        this.getContentPane().removeAll();

        //展示步数
        //给窗口添加一个展示组件
        JLabel countTxt = new JLabel("当前移动" + count + "步数");
        countTxt.setBounds(30, 10, 100, 20);
        this.add(countTxt);

        //判断胜利
        if (iswin()) {
            JLabel winLabel = new JLabel();
            winLabel.setIcon(new ImageIcon(imagePath + "2.png"));
            winLabel.setBounds(124, 250, 266, 88);
            this.add(winLabel);
        }

        //创建新图片
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //获取图片名称
                String imageName = imageData[i][j] + ".png";
                //创建一个JLabel对象，设置图片给他展示
                JLabel label = new JLabel();
                //设置图片
                label.setIcon(new ImageIcon(imagePath + imageName));
                //设置图片位置
                label.setBounds(20 + j * 100, 90 + i * 100, 100, 100);
                this.add(label);
            }
        }

        //设置背景图
        JLabel background = new JLabel(new ImageIcon(imagePath + "18.png"));
        background.setBounds(0, 30, 450, 484);
        this.add(background);

        this.repaint();
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();//菜单条
        JMenu menu = new JMenu("系统");//菜单
        JMenuItem exitJi = new JMenuItem("退出");//子菜单
        menu.add(exitJi);
        exitJi.addActionListener(e -> {
            dispose();//销毁
        });
        JMenuItem restartJi = new JMenuItem("重启");//子菜单
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            //重启
            count = 0;
            initRandomArray();
            initImage();
        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

    }

    private void initRandomArray() {

        //打乱二维数组顺序
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //随机个行列位置
                int randomRowOne = (int) (Math.random() * 3) - 1;
                int randomColOne = (int) (Math.random() * 3) - 1;

                if (row + randomRowOne >= 0 && row + randomRowOne < imageData.length && col + randomColOne >= 0 && col + randomColOne < imageData.length) {
                    int temp = imageData[row + randomRowOne][col + randomColOne];
                    imageData[row + randomRowOne][col + randomColOne] = imageData[row][col];
                    imageData[row][col] = temp;
                    row += randomRowOne;
                    col += randomColOne;
                }
            }
        }
    }

    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取按键
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });
    }

    private void switchAndMove(Direction direction) {
        switch (direction) {
            case UP:
//                System.out.println('u');
                if (row < imageData.length - 1) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row + 1][col];
                    imageData[row + 1][col] = temp;
                    row++;
                    count++;
                }
                break;
            case DOWN:
//                System.out.println('d');
                if (row > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    row--;
                    count++;
                }
                break;
            case LEFT:
//                System.out.println('l');

                if (col < imageData.length - 1) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    col++;
                    count++;
                }
                break;
            case RIGHT:
//                System.out.println('r');
                if (col > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    col--;
                    count++;
                }
                break;
        }
        initImage();
    }

    private boolean iswin() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData.length; j++) {
                if (imageData[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

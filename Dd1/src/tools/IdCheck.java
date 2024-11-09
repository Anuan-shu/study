package tools;

import Lei.User;
import Lei.UserType;

public class IdCheck {
    public static UserType check(String id) {
        //如果为8位数字前两位为[19-24]随后两位为[01-43]随后一位为[1-6]最后三位为[001-999]返回本科生
        //如果为9位前两位为SY或ZY随后两位为[21-24]随后两位为[01-43]随后一位为[1-6]最后两位为[01-99]返回硕士生
        //如果为9位前两位为BY随后两位为[19-24]随后两位为[01-43]随后一位为[1-6]最后两位为[01-99]返回博士生
        //如果为5位[00001-99999]返回教师
        //如果为5为前两位为AD随后三位为[001-999]返回管理员
        //否则返回错误
        if (id.length() == 8) {
            int year = Integer.parseInt(id.substring(0, 2));
            int XueYuan = Integer.parseInt(id.substring(2, 4));
            int BigBan = Integer.parseInt(id.substring(4, 5));
            int BanJi = Integer.parseInt(id.substring(5, 8));
            if (year >= 19 && year <= 24 && XueYuan >= 1 && XueYuan <= 43 && BigBan >= 1 && BigBan <= 6 && BanJi >= 1 && BanJi <= 999) {
                return UserType.本科生;
            }
        }
        if (id.length() == 9) {
            if ((id.substring(0, 2).equals("SY")) || (id.substring(0, 2).equals("ZY"))) {
                int year = Integer.parseInt(id.substring(2, 4));
                int XueYuan = Integer.parseInt(id.substring(4, 6));
                int BigBan = Integer.parseInt(id.substring(6, 7));
                int BanJi = Integer.parseInt(id.substring(7, 9));
                if ((id.substring(0, 2).equals("SY")) && year >= 21 && year <= 24 && XueYuan >= 1 && XueYuan <= 43 && BigBan >= 1 && BigBan <= 6 && BanJi >= 1 && BanJi <= 99) {
                    return UserType.学术型硕士研究生;
                } else if ((id.substring(0, 2).equals("ZY")) && year >= 21 && year <= 24 && XueYuan >= 1 && XueYuan <= 43 && BigBan >= 1 && BigBan <= 6 && BanJi >= 1 && BanJi <= 99) {
                    return UserType.专业型硕士研究生;
                } else {
                    return UserType.错误;
                }
            } else {
                return UserType.错误;
            }
        }
        if (id.length() == 5) {
            if (id.substring(0, 2).equals("AD")) {
                int Tid = Integer.parseInt(id.substring(2, 5));
                if (Tid >= 1 && Tid <= 999) {
                    return UserType.管理员;
                } else {
                    return UserType.错误;
                }
            } else {
                int Tid = Integer.parseInt(id.substring(0, 5));
                if (Tid >= 1 && Tid <= 99999) {
                    return UserType.教师;
                } else {
                    return UserType.错误;
                }
            }
        }
        return UserType.错误;
    }
}

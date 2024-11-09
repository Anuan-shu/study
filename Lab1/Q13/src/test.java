public class test {
    public static void main(String[] args) {
        Buyer aunt = new Buyer("小红", "姑姑");
        Buyer mother = new Buyer("小粉", "妈妈");
        Buyer me = new Buyer("小明", "我");
        Cook father = new Cook("小黑", "爸爸");
        Cook auntInLaw = new Cook("小紫", "婶婶");

        aunt.buy("苹果", "香蕉");
        mother.buy("鸡蛋", "牛奶");
        me.buy("糖");

        father.cook(auntInLaw);
    }
}

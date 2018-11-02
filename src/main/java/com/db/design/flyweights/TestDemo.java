package com.db.design.flyweights;

public class TestDemo {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite w1 = webSiteFactory.getWebSite("产品展示");
        w1.use(new User("东邪"));

        WebSite w2 = webSiteFactory.getWebSite("产品展示");
        w2.use(new User("西毒"));

        WebSite w3 = webSiteFactory.getWebSite("产品展示");
        w3.use(new User("南帝"));

        WebSite w4 = webSiteFactory.getWebSite("博客");
        w4.use(new User("北丐"));

        WebSite w5 = webSiteFactory.getWebSite("博客");
        w5.use(new User("乔峰"));

        WebSite w6 = webSiteFactory.getWebSite("博客");
        w6.use(new User("虚竹"));

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}

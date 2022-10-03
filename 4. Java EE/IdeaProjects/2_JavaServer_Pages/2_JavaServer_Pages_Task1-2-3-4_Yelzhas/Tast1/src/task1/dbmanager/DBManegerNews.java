package task1.dbmanager;

import java.util.ArrayList;

public class DBManegerNews {

    private static ArrayList<News> allNews=new ArrayList<>();
    private static Long id=7l;

    static{
        allNews.add(new News(1l,"Cristiano Ronaldo","Cristiano Ronaldo goes to Manchester United from Juventus last year, but here can not play as well as in Juventus and Real Madrid","Yelzhas","Sport",1));
        allNews.add(new News(2l,"GGG","Gennady Golovkin lost in trilogy to Canelo Alvares from Mexico","Altuha","Sport",1));
        allNews.add(new News(3l,"Prime-Minister of Kazakhstan","Prime-Minister of Kazakhstan went to the OAE to meet with minister of the OAE, and he has foolball club which named Manchester City","Yerzhan","Economics",2));
        allNews.add(new News(4l,"President Tokayev","Tokayev arrived to the USA, New-York.His mission on this trip to Speak at the UN","Yelzhas","Economics",2));
        allNews.add(new News(5l,"Dimash Kudaibergen","All Tickets to the concert, where Dimash is going to sing are all tickets sold and there is a lot of foreigners from all around the world","Altuha","Culture",3));
        allNews.add(new News(6l,"My frinend id Singer and Actor","My friend, Berik Omarov, is a singer and actor, he played as a teenager at the film Money Monet dont be funny","Yerzhan","Culture",3));
    }

    public static ArrayList<News> allNews(){
        return allNews;
    }






}

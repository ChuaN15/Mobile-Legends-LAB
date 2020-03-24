package chuan.aov;

import java.io.Serializable;
/**
 * Created by chuan on 4/7/2018.
 */


@SuppressWarnings("serial")
public class Hero implements Serializable  {
    String namee,price,intro,image1,imagestat,itembuild,skillbuild,images1,images2,images3,images4,skill11,skill111,skill22,skill222,skill33,skill333,skill44,skill444,skill1,skill2,skill3,skill4;

    public Hero(String namee,String price,String intro,String image1,String imagestat,String itembuild,String skillbuild,String images1,String images2,String images3,String images4,String skill11,String skill111,String skill22,String skill222,String skill33,String skill333,String skill44,String skill444,String skill1,String skill2,String skill3,String skill4)
    {
        this.namee = namee;
        this.price = price;
        this.intro = intro;
        this.image1 = image1;
        this.imagestat = imagestat;
        this.itembuild = itembuild;
        this.skillbuild = skillbuild;
        this.images1 = images1;
        this.images2 = images2;
        this.images3 = images3;
        this.images4 = images4;
        this.skill11 = skill11;
        this.skill111 = skill111;
        this.skill22 = skill22;
        this.skill222 = skill222;
        this.skill33 = skill33;
        this.skill333 = skill333;
        this.skill44 = skill44;
        this.skill444 = skill444;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.skill4 = skill4;
    }
}

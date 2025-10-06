package Dominio;

public abstract class UserExperience implements Cloneable {
    private String username;
    private String planType; //plan de datos (fibra, móvil, fusión, nuevo cliente)
    private String menu;
    private String offers;
    private String banners;

    public UserExperience(String username, String planType, String menu, String offers, String banners) {
        setUsername(username);
        setPlanType(planType);
        setMenu(menu);
        setOffers(offers);
        setBanners(banners);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
public String getUsername() {
        return username;
}
public String getPlanType() {
        return planType;
}
public String getMenu() {
        return menu;
}
public String getOffers() {
        return offers;
}
public String getBanners() {
        return banners;
}

public void setUsername(String username) {}
public void setPlanType(String planType) {}
    public void setMenu(String menu) {}
    public void setOffers(String offers) {}
    public void setBanners(String banners) {}




}

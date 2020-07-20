public class DaoFactory {
    private static Ads adsDao;
    private static Cars carsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Cars getCarsDao(){
        if(carsDao == null){
            carsDao = new ListCarsDao();
        }
        return carsDao;
    }
}

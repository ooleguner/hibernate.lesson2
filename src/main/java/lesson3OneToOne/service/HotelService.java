package lesson3OneToOne.service;

import lesson3OneToOne.model.Hotel;
import lesson3OneToOne.repository.HotelDAO;

public class HotelService {
    static HotelDAO hotelDAO = new HotelDAO();

    public static void save(Hotel hotel) {
        hotelDAO.save(hotel);
    }

    public static void delete (long id){
        try {
            hotelDAO.delete(id);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    public static Hotel findById (long id){
        return hotelDAO.findById(id);
    }

    public static void update (Hotel hotel){
        hotelDAO.update(hotel);
    }
}

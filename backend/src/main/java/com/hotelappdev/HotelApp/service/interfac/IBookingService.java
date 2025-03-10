package com.hotelappdev.HotelApp.service.interfac;


import com.hotelappdev.HotelApp.dto.Response;
import com.hotelappdev.HotelApp.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}

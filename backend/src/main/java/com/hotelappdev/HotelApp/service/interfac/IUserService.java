package com.hotelappdev.HotelApp.service.interfac;


import com.hotelappdev.HotelApp.dto.LoginRequest;
import com.hotelappdev.HotelApp.dto.Response;
import com.hotelappdev.HotelApp.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

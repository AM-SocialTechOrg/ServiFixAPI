package com.servifix.restapi.servifixAPI.application.services;

import com.servifix.restapi.servifixAPI.application.dto.request.NotificationRequestDTO;
import com.servifix.restapi.servifixAPI.application.dto.response.NotificationResponseDTO;
import com.servifix.restapi.shared.model.dto.response.ApiResponse;

import java.util.List;

public interface NotificationService {

    ApiResponse<NotificationResponseDTO> getNotificationById(int id);

    ApiResponse<Void> deleteNotification(int id);

    ApiResponse<NotificationResponseDTO> createNotification(NotificationRequestDTO notificationRequestDTO);

    ApiResponse<List<NotificationResponseDTO>> getNotificationByAccount(int account_id);
}

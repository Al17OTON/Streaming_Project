package com.media.backend.streaming.response;

import com.media.backend.response_template.BaseResponseTemplate;
import lombok.*;

@Getter
@Setter
public class AuthResponse extends BaseResponseTemplate {
    int camera_id;

    public AuthResponse(int camera_id, String message, int status_code) {
        super(message, status_code);
        this.camera_id = camera_id;
    }
}

package com.media.backend.streaming.response;

import com.media.backend.response_template.BaseResponseTemplate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DisconnectResponse extends BaseResponseTemplate {
    public DisconnectResponse(String msg, int status) { super(msg, status); }
}

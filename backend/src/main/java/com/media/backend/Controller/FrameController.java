package com.media.backend.Controller;

import com.media.backend.Handler.UdpInboundMessageHandler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrameController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        System.out.println("TEST");
        return ResponseEntity.ok("Success");
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(
            value = "/{cameraId}",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getFrame(@PathVariable("cameraId") String cameraId) {
//        InputStream in = new ByteArrayInputStream(UdpInboundMessageHandler.camera_data_assembled[Integer.parseInt(cameraId)]);
        return UdpInboundMessageHandler.camera_data_assembled[Integer.parseInt(cameraId)];
    }
}

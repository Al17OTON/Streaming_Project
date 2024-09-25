# Streaming_Project
> WebCam에서 Spring Boot 서버를 거쳐 React 클라이언트로 실시간 영상을 전송하는 예제 프로젝트 입니다.

### 목표
- [x] UDP를 통한 전송
- [ ] RTSP를 통한 전송


### 준비사항
* C++ Streaming
    > OpenCV와 Graphic Card가 필요합니다. <br>
    > Yolov8s.onnx가 필요합니다. <br>
    > WebCam이 연결되어 있어야합니다. <br>
    > live555가 필요합니다.

* Backend
    > Spring Boot를 실행할 환경이 필요합니다.

* Frontend
    > React를 실행할 환경이 필요합니다.


### Live555 설치하기
> 윈도우 C++ 환경에서 live555를 설치하기 위해서는 vcpkg가 설치되어 있어야 합니다. 

1. vcpkg를 설치하고 알맞게 설정합니다.
2. vcpkg에서 live555:x64-windows를 설치합니다.
3. Visual Studio 터미널에서 다음 명령어를 입력합니다.
``` 
vcpkg new --application
vcpkg add port live555
```

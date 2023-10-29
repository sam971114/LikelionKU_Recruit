package com.likelionku.likelionrecruit.controller;


import com.likelionku.likelionrecruit.domain.Hackathon;
import com.likelionku.likelionrecruit.domain.Ideathon;
import com.likelionku.likelionrecruit.service.HackathonService;
import com.likelionku.likelionrecruit.service.IdeathonService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ImageApiController {
    private final HackathonService hackathonService;
    private final IdeathonService ideathonService;

    @GetMapping("/api/getIdeathon/{id}")
    public String getIdeathonUrl(@PathVariable Long id) {
        String ideathonUrl = ideathonService.getImageUrlById(id);
        // 외부 스토리지에서 이미지를 가져오는 로직 (imageUrl 사용)
        // 이미지 URL을 그대로 반환합니다.(인코딩x)
        return ideathonUrl;
    }

    @GetMapping("/api/getHackathon/{id}")
    public String getHackathonUrl(@PathVariable Long id) {
        String hackathonUrl = hackathonService.getImageUrlById(id);
        // 외부 스토리지에서 이미지를 가져오는 로직 (imageUrl 사용)
        // 이미지 URL을 그대로 반환합니다.(인코딩x)
        return hackathonUrl;
    }


    @PostMapping("/api/uploadHackathon")
    @ResponseStatus(HttpStatus.OK)
    public void uploadHackathonUrl(@RequestBody Hackathon hackathon) {
        //이미지 URL을 저장
        hackathonService.saveImageUrl(hackathon);
    }

    @PostMapping("/api/uploadIdeathon")
    @ResponseStatus(HttpStatus.OK)
    public void uploadIdeathonUrl(@RequestBody Ideathon ideathon) {
        //이미지 URL을 저장
        ideathonService.saveImageUrl(ideathon);

    }

}

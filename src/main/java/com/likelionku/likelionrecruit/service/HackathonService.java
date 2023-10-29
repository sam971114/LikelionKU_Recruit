package com.likelionku.likelionrecruit.service;


import com.likelionku.likelionrecruit.domain.Hackathon;
import com.likelionku.likelionrecruit.domain.Ideathon;
import com.likelionku.likelionrecruit.repository.HackathonRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
@RequiredArgsConstructor
public class HackathonService {
    private final HackathonRepository hackathonRepository;

    public String getImageUrlById(Long id) {
        // 이미지 ID를 기반으로 이미지 URL을 가져오는 로직
        Hackathon hackathon = hackathonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Image not found with id: " + id));
        return hackathon.getUrl();
    }

    public Long saveImageUrl(Hackathon hackathon) {
        // 이미지 URL을 저장하고, 저장된 이미지의 ID를 반환합니다.
        hackathonRepository.save(hackathon);
        return hackathon.getId();
    }




}

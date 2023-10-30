package com.likelionku.likelionrecruit.service;


import com.likelionku.likelionrecruit.domain.Hackathon;
import com.likelionku.likelionrecruit.domain.Ideathon;
import com.likelionku.likelionrecruit.repository.IdeathonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false)
@RequiredArgsConstructor
public class IdeathonService {
    private final IdeathonRepository ideathonRepository;

    public String getImageUrlById(Long id) {
        // 이미지 ID를 기반으로 이미지 URL을 가져오는 로직
        Ideathon ideathon = ideathonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Image not found with id: " + id));
        return ideathon.getPhoto();
    }

    public Long saveImageUrl(Ideathon ideathon) {
        // 이미지 URL을 저장하고, 저장된 이미지의 ID를 반환합니다.
        ideathonRepository.save(ideathon);
        return ideathon.getId();
    }
}

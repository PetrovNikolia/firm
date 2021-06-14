package com.example.firm.controller;

import com.example.firm.dto.RequestDto;
import com.example.firm.dto.RequestForm;
import com.example.firm.service.RequestService;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/request")
@RestController
@RequiredArgsConstructor
public class RequestRestController {
    private final RequestService requestService;

    @PostMapping("/add")
//    @PreAuthorize("hasRole('USER')")
    public RequestDto addRequest(@RequestBody RequestForm form) throws IOException {
        return requestService.add(form);
    }

    @DeleteMapping(path = "/")
    public void deleteRequestUser(@RequestParam UUID id) {
        requestService.deleteRequest(id);
    }

    @GetMapping("/")
//    @PreAuthorize("hasRole('USER')")
    public RequestDto getRequest(@RequestParam UUID id) throws IOException {
        return requestService.getRequest(id);
    }

    @GetMapping("/all")
//    @PreAuthorize("hasRole('USER')")
    public List<RequestDto> getAllRequest() throws IOException {
        return requestService.getAllRequestUser();
    }
}

package com.dytechnology.api_qrcode_portfolio.controller;

import com.dytechnology.api_qrcode_portfolio.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @Autowired
    private QrCodeService qrCodeService;

    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> gerarQr(@RequestParam String texto) {
        try {
            byte[] imagem = qrCodeService.gerarQrCode(texto, 250, 250);
            return ResponseEntity.ok(imagem);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping(value = "/download", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> baixarQrCode(@RequestParam String texto) {
        try {
            byte[] imagem = qrCodeService.gerarQrCode(texto, 300, 300);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG);
            headers.setContentDisposition(
                    ContentDisposition.builder("attachment")
                            .filename("qr-code.png")
                            .build()
            );

            return new ResponseEntity<>(imagem, headers, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}

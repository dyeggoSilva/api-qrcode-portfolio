package com.dytechnology.api_qrcode_portfolio.service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class QrCodeService {

    public byte[] gerarQrCode(String texto, int largura, int altura) throws Exception {
        BitMatrix matrix = new MultiFormatWriter()
                .encode(texto, BarcodeFormat.QR_CODE, largura, altura);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(matrix, "PNG", out);

        return out.toByteArray();
    }
}

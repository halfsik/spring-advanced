package com.sik.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV0 {

    public void save(String itemId){
        if(itemId.equals("ex")){
            throw new IllegalStateException("예외 발생");
        }

        //상품저장하는데 1초정도 걸린다
        sleep(1000);
    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

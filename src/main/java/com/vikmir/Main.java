package com.vikmir;

import com.vikmir.exeption.NoSuchBeanException;
import com.vikmir.service.AfternoonService;
import com.vikmir.service.EveningService;
import com.vikmir.service.MorningService;

public class Main {

    public static void main(String[] args) throws NoSuchBeanException {
        ApplicationContext context = new AnnotationApplicationContext("com.vikmir.service");
//        MorningService morningService = context.getBean(MorningService.class);
        AfternoonService afternoonService = context.getBean(AfternoonService.class);
        EveningService eveningService = context.getBean(EveningService.class);

//        morningService.ola();
        afternoonService.ola();
        eveningService.ola();
    }

}
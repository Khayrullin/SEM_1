package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.form.GoodsCreationForm;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.Good;
import ru.kpfu.itis.model.GoodOnHub;
import ru.kpfu.itis.model.Hub;
import ru.kpfu.itis.model.User;

import java.util.List;

@Service
public interface HubService {


    void changeGoodCount(Good good,Hub hub, int count);


    List<GoodOnHub> findAllbyGood(Good good);


    GoodOnHub findGood(Good good, Hub hub);

    List<Hub>  findAllHubs();




}

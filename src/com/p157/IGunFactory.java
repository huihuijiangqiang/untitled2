package com.p157;

public interface IGunFactory {

//    生产机关枪
    IBullets createBullets();

//    生产冲锋枪
    IGun createGun();
}

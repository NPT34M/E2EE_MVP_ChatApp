package com.example.e2ee_mvp.model

import java.math.BigInteger

class UserInfoLocal(val uid: String, val password2: String, val privateNum: BigInteger) {
    constructor() : this("", "", BigInteger.ONE)
}
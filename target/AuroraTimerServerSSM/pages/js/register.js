window.onload = function() {

    document.getElementById("nickname").addEventListener("blur", checkNickname, false);
    document.getElementById("id").addEventListener("blur", checkId, false);
    document.getElementById("password").addEventListener("blur", checkPassword, false);
    document.getElementById("conf").addEventListener("blur", checkConf, false);
}

function checkId(){
    var objElement = document.getElementById("id");
    var msgElement = document.getElementById("id" + "Msg");
    //var reg = /^[1-9][0-9]{5,13}$/;
    //if(reg.test(objElement.value)) {
    if(objElement.value != "") {
        objElement.className = "right";
        // msgElement.innerHTML = "<font color='green'>yes</font>"
        return true;
    } else {
        objElement.className = "wrong";
        // msgElement.innerHTML = "<font color='red'>no</font>";
        return false;
    }
}

function checkNickname(){
    var objElement = document.getElementById("nickname");
    var msgElement = document.getElementById("nickname" + "Msg");
    if (objElement.value != "") {
        // msgElement.innerHTML = "<font color='green'>yes</font>"
        objElement.className = "right";
        return true;
    } else {
        // msgElement.innerHTML = "<font color='red'>no</font>";
        objElement.className = "wrong";
        return false;
    }
}

function checkPassword(){
    var objElement = document.getElementById("password");
    var msgElement = document.getElementById("password" + "Msg");
    var reg = /^\w{6,12}$/;
    if(reg.test(objElement.value)) {
        objElement.className = "right";
        // msgElement.innerHTML = "<font color='green'>yes</font>"
        return true;
    } else {
        objElement.className = "wrong";
        // msgElement.innerHTML = "<font color='red'>no</font>";
        return false;
    }
}

function checkConf(){
    var objElement = document.getElementById("conf");
    var msgElement = document.getElementById("conf" + "Msg");
    var password = document.getElementById("password");
    if (password.value == objElement.value) {
        // msgElement.innerHTML = "<font color='green'>yes</font>";
        objElement.className = "right";
        return true;
    } {
        // msgElement.innerHTML = "<font color='red'>no</font>";
        objElement.className = "wrong";
        return false;
    }
}

function checkAll(){
    if (checkPassword() && checkNickname() && checkId() && checkConf()) {
        var nNickname = document.getElementById("nickname");
        var password = document.getElementById("password");
        var conf = document.getElementById("conf");
        conf.value = hex_md5(password.value);
        password.value = conf.value;
        return true;
    } else {
        return false;
    }
}

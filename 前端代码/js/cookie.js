function setValue(key, value) {
    sessionStorage.setItem(key,value);
}

function isExistKey(key) {
    if(sessionStorage.getItem(key) != null && sessionStorage.getItem(key) != ''){
        return 1;
    }
    return 0;
}

function dKey(key) {
    sessionStorage.removeItem(key);
}

function getUserId() {
    return sessionStorage.getItem('userId');
}

function getRealName() {
    return sessionStorage.getItem('realName');
}

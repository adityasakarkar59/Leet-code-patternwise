/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let sing = x<0? -1:1;
    x=Math.abs(x);
    let rev=0;
    while(x>0){
        let d=x%10;
        rev = rev*10+d;
        x=Math.floor(x/10);
    }
    rev *= sing;
    if(rev>2147483647 || rev<-2147483648){
        return 0;
    }
    return rev;
};
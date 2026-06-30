/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    var pr=1;
    var sum=0;
    while(n>0){
        var d=n%10;
        pr *= d
        sum +=d;
        n = Math.floor(n / 10);;
    }
    return pr-sum;
};
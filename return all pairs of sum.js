function returnAllPairs(arr,sum) {

    var outputArray = [];
    var hashMap = {};

    for (let i = 0; i < arr.length; i++){
        hashMap[arr[i]] = (hashMap[arr[i]] || 0)  + 1;
    }

    for (let i = 0; i < arr.length; i++){
           if(hashMap[sum - arr[i]]) {
               outputArray.push([ arr[i], sum - arr[i]]);
               hashMap[arr[i]] = hashMap[arr[i]] - 1;
           }
          
    }

    return outputArray;
}



function returnAllPairs(arr,sum) {

    var outputArray = [];

    for (let i = 0; i < arr.length; i++){

           var localResult = sum - arr[i];
           if(arr.indexOf(localResult) !== -1){
               outputArray.push([ arr[i], arr[arr.indexOf(localResult)]]);
               arr.splice(arr.indexOf(localResult),1);
           }
    }

    return outputArray;
}

returnAllPairs([-4,-3,-2,-1,0,1,2,4,5], 7)
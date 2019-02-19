

class MyHashmap {

    constructor(size){
        this.data = new Array(size);
    }

    _hash(key) {
        let hash = 0;
        for(let i = 0; i < key.length; i++){
            hash = (hash + key.charCodeAt(i)*i);
        }
        return hash;
    }

    set(key, value){
        let hashedAddress = this._hash(key);

        if(!this.data[hashedAddress]) {
            this.data[hashedAddress] = []
        }

        this.data[hashedAddress].push([key,value]);
        return this.data;
    }

    get(key) {
        let hashedAddress = this._hash(key);
        let getValueFromAddress = this.data[hashedAddress];

        if(getValueFromAddress){
            for(let i = 0; i < getValueFromAddress.length; i++){
                if(getValueFromAddress[i][0] === key){
                    return getValueFromAddress[i][1];
                }
            }
        }
        return undefined;
    }

    keys(){
        const keysArray = [];
        for (let i = 0; i < this.data.length; i++){
          if(this.data[i]){
            keysArray.push(this.data[i][0][0])
          }
        }
        return keysArray;
      }
}

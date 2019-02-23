

class MyArray {

    constructor(){
        this.length = length;
        this.data = {};
    }

    get(index){
        return this.data[index];
    }

    push(value){
        this.data[this.length] = value;
        this.length++;
        return this.data;
    }

    pop(){
        var lastItem = this.data[this.length-1];
        delete this.data[this.length-1];
        this.length--;
        return lastItem;
    }

    deleteAtIndex(index){
        const item = this.data[index];
        this.shiftItems(index);
        return item;
    }
    shiftItems(index){
        for (let i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
          }
          delete this.data[this.length - 1];
          this.length--;
    }
}
class ListView (var array: Array<String>){

    inner class ListViewItems(){
        fun displayItem(position:Int){
            println(array[position])
        }
    }
}
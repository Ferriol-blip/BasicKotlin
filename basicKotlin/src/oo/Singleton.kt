package oo

class Singleton {
    //Un object de tipo Singleton solo sirve en casos donde solo queramos poder isntanciar una unica vez una clase.
    object  Cache {
        val name =  "Cache"

        fun retrieveDate() : Int {
            return 0;
        }
    }
}

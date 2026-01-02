package Threads2;

class Mur{
    private boolean MurFini = false;
    synchronized void Saigner() throws InterruptedException {
        while(MurFini == false){
            wait();
        }
        System.out.println("on fait la saigner pour poser l'electricité");
    }
    synchronized void Construire(){
        System.out.println("le mur est construit");
        MurFini = true;
        notify();
    }
}
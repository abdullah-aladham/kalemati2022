import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';

@Component({
  selector: 'app-addchild',
  templateUrl: './addchild.component.html',
  styleUrls: ['./addchild.component.scss'],
})
export class AddchildComponent  implements OnInit {

  
  constructor(private modalCtrl: ModalController) {

  }

  public cancel() {
    this.modalCtrl.dismiss({
      dismissed: true
    });
  }
  ngOnInit() { }
    
   name: string='';
   gender: string='';
   age:number=0.0;
   children = [{
     name: '',
     gender: '',
     age: ''}];

  async addchild() {
    
    
    }



    // alert('jwjhegwge');
    //debugger;
    // const child = { name: this.name, gender: this.gender, age: this.age };//these elements are connected with above inputs but the above ones are not connected with ngmodels 
    // this.modalCtrl.dismiss(child);
    // console.log(child);
    // // debugger;



  }


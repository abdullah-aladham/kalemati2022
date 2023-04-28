import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule, ModalController } from '@ionic/angular';
import { Router } from '@angular/router';

@Component({
  selector: 'app-my-cards',
  templateUrl: './my-cards.page.html',
  styleUrls: ['./my-cards.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class MyCardsPage implements OnInit {

  //constructor() { }
  imagesrc:any;
  image:any;
  ngOnInit() {
  }
  constructor(public ModalCtrl: ModalController, public router: Router) { }


  public showcards() {
    this.router.navigateByUrl('mycards-explore');

  }
  back() {
    this.router.navigateByUrl('tabs/tab1');

  }

}

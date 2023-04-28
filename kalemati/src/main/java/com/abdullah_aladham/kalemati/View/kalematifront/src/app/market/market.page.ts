import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule, ModalController } from '@ionic/angular';
import { Router } from '@angular/router';
import { ProductDetailsComponent } from '../product-details/product-details.component';

@Component({
  selector: 'app-market',
  templateUrl: './market.page.html',
  styleUrls: ['./market.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class MarketPage implements OnInit {

  // constructor() { }
  constructor(public router: Router, public modalCtrl: ModalController) { }

  ngOnInit() {
  }
  public back() {
    this.router.navigateByUrl('tab1');
  }

  public showdetails() {
    const modal1 = this.modalCtrl.create({
      component: ProductDetailsComponent
    });
    modal1.then(mdl => {
      mdl.present();
    });

  }
  //end of show
}

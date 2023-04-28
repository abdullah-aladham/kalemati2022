import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./tabs/tabs.routes').then((m) => m.routes),
  },
  {
    path: 'forgotpass',
    loadComponent: () => import('./forgotpass/forgotpass.page').then( m => m.ForgotpassPage)
  },
  {
    path: 'login',
    loadComponent: () => import('./login/login.page').then( m => m.LoginPage)
  },
  {
    path: 'market',
    loadComponent: () => import('./market/market.page').then( m => m.MarketPage)
  },
  {
    path: 'my-cards',
    loadComponent: () => import('./my-cards/my-cards.page').then( m => m.MyCardsPage)
  },
  {
    path: 'mycards-explore',
    loadComponent: () => import('./mycards-explore/mycards-explore.page').then( m => m.MycardsExplorePage)
  },
  {
    path: 'password-reset',
    loadComponent: () => import('./password-reset/password-reset.page').then( m => m.PasswordResetPage)
  },
  {
    path: 'register',
    loadComponent: () => import('./register/register.page').then( m => m.RegisterPage)
  },
];

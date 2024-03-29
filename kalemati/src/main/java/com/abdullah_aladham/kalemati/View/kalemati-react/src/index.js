import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import * as Icon from 'react-bootstrap-icons';
import "bootstrap/dist/css/bootstrap.min.css"
import {BrowserRouter} from "react-router-dom"
import RecommendedPage from './Pages/RecommendedPage';
import KalematiPage from './Pages/KalematiPage';
import ProfilePage from'./Pages/ProfilePage';
import PackageView from './Pages/PackageView';
import ClassRoom from './Pages/ClassRoom';

import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import Err from './Pages/errors/Err';
import Login from "./Pages/UserMembership/Login";
//import Login from './Pages/User-membership/login';
// import KalematiPage from './Pages/KalematiPage';
// import Recomended from './recomended';
const router = createBrowserRouter([
  {
    path: "/",
    element: <App/>,
    errorElement:<Err/>
  },
  {
    path: "/Pages/KalematiPage",
    element: <KalematiPage />,
    errorElement: <Err />,
  }, 
  {
    path: "/Pages/RecommendedPage",
    element: <RecommendedPage />,
    errorElement: <Err />,
  },
  {
    path: "/Pages/ProfilePage",
    element: <ProfilePage />,
    errorElement: <Err />,
  },
 {
   path: "/Pages/PackageView/",
    element: <PackageView />,
    errorElement: <Err />,
  },
  {
    path: "/Pages/ClassRoom/",
     element: <ClassRoom />,
     errorElement: <Err />,
   },  {
    path: "Pages/UserMembership/Login",
     element: <Login />,
     errorElement: <Err />,
   },

  
]);
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
    {/* <BrowserRouter>
      {/* <App /> */}
      

    {/* </BrowserRouter> */} 
  </React.StrictMode>
);
 

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

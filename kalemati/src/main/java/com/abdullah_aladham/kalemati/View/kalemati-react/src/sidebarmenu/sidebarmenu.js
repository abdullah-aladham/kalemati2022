import React, { useState } from 'react';
import "./sidebar.css";
import * as Icon from "react-bootstrap-icons";
import "bootstrap-icons/font/bootstrap-icons.css"
import {Route ,Routes,Link} from "react-router-dom";
import KalematiPage from '../Pages/KalematiPage';
import { Style } from '@material-ui/icons';
// import NavbarCollapse from 'react-bootstrap/esm/NavbarCollapse';
const Sidebarmenu = () => {
    // const [isExpended, setExpendState] =useState(false);
let [navCollapse,setNavCollapse]=useState(true);
    return (
        
        // <div className='side-nav-container'>
        //     <div className='nav-upper'>
        //         <div className='nav-heading'>
        //             <div className='nav-brand'>
        //                 <img src='src\images\kalemati-brand.svg'/>
        //                 <h2>Kalemati</h2>
        //             </div>
        //             <button className={isExpended?'hamburger hamburger-in':"hamburger hamburger-out"}
        //             onClick={() => setExpendState(isExpended)}
        //             >
        //                 <span></span>
        //             </button>
        //         </div>
        //     </div>
        // </div>
        // <div className='container'>
        //     <nav className='nav'>
        //         <h2>Kalemati</h2>
        //         <ul>
        //             <li>Home</li>
        //             <li>My profile</li>
        //             <li>logout</li>

        //         </ul>
        //     </nav>
        <>
        {/* <Routes> */}
    {/* <Route path='/' element={<App/>}/> */}
    {/* <Route path="../Pages/KalematiPage" element={<KalematiPage/>} />
  </Routes> */}
            <div className='sidebar-content'>
                
                <i className='bi bi-justify' onClick={e=>setNavCollapse(!navCollapse)}></i>
            <nav className={`sidebar-container ${navCollapse ? "navCollapse":""}`}>
            <div className='navbar-brand'>
                  <Link to="/"> <img src={require('../images/kalemati-brand.png')} id="brand"/></Link>
                    
                </div>
                <div className='nav-option option1'>
                    <Icon.HouseFill className='icon1'/>
                    <Link to="/" className='link'> <span>Homepage</span></Link>

                </div>
                <div className='nav-option option1'>
                <Link to="./Pages/ProfilePage" className='link'><Icon.PersonCircle className='icon1'/></Link>
                    <Link to="./Pages/ProfilePage" className='link'>My Profile</Link>
                </div>
               
                <div className='nav-option option1'>
                <Link to="../../Pages/KalematiPage" className='link'> <Icon.CardImage className='icon1'/></Link>
                    <Link to="../../Pages/KalematiPage" className='link'><i>My Cards</i></Link>
                </div>
                <div className='nav-option option1'>
                <Link  to={"./Pages/RecommendedPage"} > <Icon.Heart className='icon1'/></Link>
                    <Link  to={"./Pages/RecommendedPage"} className='link'>Recommended</Link>
                </div>
            </nav>
            </div>
            
       </>
      
        );

};

export default Sidebarmenu;
import React, { Component } from 'react';
import {
    MDBFooter,
    MDBIcon,
    MDBInput,
    MDBCol,
    MDBRow,
    MDBBtn
  } from 'mdb-react-ui-kit';
  import "bootstrap/dist/css/bootstrap.min.css"
  import  * as icons  from 'react-bootstrap-icons';
  import "./style.css"
import { Face } from '@material-ui/icons';
import { Link } from 'react-router-dom';
import KalematiPage from './Pages/KalematiPage';
class Footer extends Component {
    render() {
        return (
         <footer >
            <div className='container'>
                <div className='row'>
                <div className='col-sm-4'>
                    <h5>About us</h5>
                    <p >البطاقات الأكثر اعتمادا من مراكز النطق في فلسطين</p>

                </div>
                <div className='col-sm-2'>
                    <h5>Navigation</h5>
                    <p>  <Link to='/' className='Link'>Home</Link></p>
                    <p>  <Link to='./Pages/KalematiPage' className='Link'>Aboutus</Link></p>
                </div>

                <div className='col-sm-2'>
                    <h5>Services</h5>
                    <p>  <Link to='./Pages/KalematiPage' className='Link'>My Cards</Link></p>
                    <p>  <a href='./Pages/RecomendedPage'className='Link'>Recommended</a></p>
                </div>
                <div className='col-sm-2'>
                {/* <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" className="bi bi-facebook" viewBox="0 0 16 16">
  <path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z"/>
</svg> */}<section>
                <a href='https://www.facebook.com/kalemati.cards' target="_blank"><icons.Facebook id='icons.fb'/></a>
                <a href="https://www.linkedin.com/company/kalemati/" target="_blank"><icons.Linkedin id='icons.in'/></a>
            </section>

            </div>
            <section>
    <p style={{textAlign:"center",color:'white'}}>Done with ❤️‍🔥 by <a href="https://www.linkedin.com/in/abdullah-aladham/" target="_blank" className='credits'>Abdullah Aladham</a></p>
</section>
            </div>
        
            </div>
            


         </footer>
        );
    }
}

export default Footer;
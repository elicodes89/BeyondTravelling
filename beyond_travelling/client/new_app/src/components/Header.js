import React from 'react';
import Navbar from 'react-bootstrap/Navbar';
import logo from '../app_logos/logo.png';
import '../App.css';

function Header () {

return (
   <>
   <Navbar  className="justify-content-left" bg="dark" variant="dark">
      <Navbar.Brand href="#">
        <img
          src={logo}
          alt="logo"
          width="200"
          height="200"
          className="d-inline-block align-center"
        />
        <span>Beyond Travelling</span>
       </Navbar.Brand>
  </Navbar>
   
   </>
    
  );
}
  export default Header;
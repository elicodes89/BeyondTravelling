import React from 'react';
import Navbar from 'react-bootstrap/Navbar';
import logo from '../app_logos/logo.png';
// import './App.css';

function Header () {

return (
   <>
   <Navbar  className="justify-content-center" bg="dark" variant="dark">
      <Navbar.Brand href="#">
        <img
          src={logo}
          alt="logo"
          width="110"
          height="100"
          className="d-inline-block align-center"
        />
        Beyond Travelling
       </Navbar.Brand>
  </Navbar>
   
   </>
    
  );
}
  export default Header;
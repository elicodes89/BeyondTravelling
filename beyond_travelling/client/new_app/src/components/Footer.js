import React from 'react';
import logo from '../app_logos/logo.png';
import '../Footer.css';
import signingicon from '../access_icons/signingicon.jpeg';
import { FaWheelchair } from "react-icons/fa";

const Footer = () => {
  return (
    <>
    <div className="main-footer">
        <div className="container">
            <div className='row'>
                {/* Column1 */}
                <div className='col'>
                    <h4>Beyond Travelling</h4>
                    <ul className='list-unstyled'>
                        <li>38 Milky Way</li>
                        <li>Edinburgh, Scotland</li>
                        <li>001 (907)-206-7700</li>
                    </ul>
                </div>
                {/* Column2 */}
                <div className='col'>
                <h4><FaWheelchair size="1em" alt="wheelchair"/>Wheelchair accessible</h4>
                    <ul>
                        <li><a href="https://www.sagetraveling.com/edinburgh-accessible-travel">Rolling in Edinburgh</a></li>
                        <li><a href="https://wheelchairtravel.org/london/">Rolling in London</a></li>
                        <li><a href="https://disabledaccessibletravel.com/accessible-destinations/ireland/accessible-cork">Accessible Tours in Ireland</a></li>
                        </ul>
                </div>
                {/* Column3 */}
                <div className='col'>
                    <h4><img src={signingicon} alt="signing icon" width="45px"/>BSL content</h4>
                    <ul className='list-unstyled'>
                        <li><a href="https://www.nhm.ac.uk/events/deaf-led-bsl-behind-the-scenes-tour-spirit-collection.html?fbclid=IwAR2lZwPkv2kc6GhCjpx6j0b9co13-o1E0SwjHWBprNX-Yi2GFq1VtiY8gXs">Deaf led tour at the Natural History Museum London</a></li>
                        <li><a href="https://www.edinburghcastle.scot/see-and-do/tours-guides-and-itineraries/british-sign-language-tour">BSL Tours at Edinburgh Castle</a></li>
                        <li><a href="https://www.littlemuseum.ie/irish-sign-language-tour">ISL Tour at Little Museum Dublin</a></li>
                    </ul>
                </div>
                <hr />
                <div className="row">
                    <p className='col-sm'>
                        &copy;{new Date().getFullYear()} BeyondTravelling | All rights reserved | Created by Annika, Elisol, Mate and friendly support from Paul, Qualified BSL Interpreter
                    </p>
                </div>
            </div>
            
        </div>

    
    
    
    </div>
    </>
  )
}

  export default Footer;
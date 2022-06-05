import React from 'react';
import logo from '../app_logos/logo.png';
// import './App.css';

const Footer = () => {
  return (

    <div className="main-footer">
        <div className="container">
            <div className='row'>
                {/* Column1 */}
                <div className='col'>
                    <h4>Beyond Travelling</h4>
                    <ul className='list-unstyled'>
                        <li>42 Milky Way</li>
                        <li>Edinburgh, Scotland</li>
                        <li>0131 555 555</li>
                    </ul>
                </div>
                {/* Column2 */}
                <div className='col'>
                        <li><a href="https://www.sagetraveling.com/edinburgh-accessible-travel">Wheelchair accessible Edinburgh</a></li>
                        <li><a href="https://wheelchairtravel.org/london/">Wheelchair accessible London</a></li>
                        <li><a href="https://disabledaccessibletravel.com/accessible-destinations/ireland/accessible-cork">Wheelchair accessible Tours in Ireland</a></li>
                        <li>Wheelchair accessible Manchester</li>
                </div>
                {/* Column3 */}
                <div className='col'>
                        <li><a href="https://www.nhm.ac.uk/events/deaf-led-bsl-behind-the-scenes-tour-spirit-collection.html?fbclid=IwAR2lZwPkv2kc6GhCjpx6j0b9co13-o1E0SwjHWBprNX-Yi2GFq1VtiY8gXs">Deaf led tour at the Natural History Museum London</a></li>
                        <li><a href="https://www.edinburghcastle.scot/see-and-do/tours-guides-and-itineraries/british-sign-language-tour">BSL Tours at Edinburgh Castle</a></li>
                        <li><a href="https://www.littlemuseum.ie/irish-sign-language-tour">ISL Tour at Little Museum Dublin</a></li>
                        <li>Wheelchair accessible Manchester</li>
                </div>


            </div>
            <h6>Created by Annika, Elisol, Mate and friendly support of Paul, Qualified BSL Interpreter</h6>
        </div>

    
    
    
    </div>
  )
}

  export default Footer;
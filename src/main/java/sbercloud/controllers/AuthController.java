//package com.example.hj.controllers;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@RequiredArgsConstructor
//public class AuthController {
//
//    private final AuthenticationManager authenticationManager;
//    private final UserDetailsService hjUserDetailsService;
////    private final JWTUtils jwtUtils;
//
////    @PostMapping(value = "/auth",
////            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
////            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
////    public ResponseEntity<?> createAuthenticationToken(@Valid AuthenticationRequest authenticationRequest, BindingResult result) throws Exception {
////        System.out.println(result);
////        String name = authenticationRequest.getName();
////        try {
////            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(name, authenticationRequest.getPassword()));
////        } catch (Exception ex) {
////            throw new Exception("Incorrect name or password");
////        }
////        final UserDetails userDetails = hjUserDetailsService.loadUserByUsername(name);
////        final String jwt = jwtUtils.generateToken(userDetails);
////
////        HttpHeaders headers = new HttpHeaders();
////        headers.setContentType(MediaType.APPLICATION_JSON);
////        return new ResponseEntity<>(new AuthenticationResponse(jwt), headers, HttpStatus.OK);
////    }
//}
